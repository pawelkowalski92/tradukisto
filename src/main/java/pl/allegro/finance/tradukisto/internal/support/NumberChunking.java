package pl.allegro.finance.tradukisto.internal.support;

import com.google.common.math.IntMath;
import com.google.common.math.LongMath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class NumberChunking {

    private static final Integer CHUNK_SIZE = 3;
    private static final Integer SPLIT_FACTOR = IntMath.pow(10, CHUNK_SIZE);

    public List<Integer> chunk(Long value) {
        Deque<Integer> result = new ArrayDeque<>();

        while (value > 0) {
            result.addFirst(LongMath.mod(value, SPLIT_FACTOR));
            value /= SPLIT_FACTOR;
        }

        return new ArrayList<>(result);
    }
}
