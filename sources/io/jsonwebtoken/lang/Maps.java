package io.jsonwebtoken.lang;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Maps {

    public static class HashMapBuilder<K, V> implements MapBuilder<K, V> {
        private final Map<K, V> data;

        private HashMapBuilder() {
            this.data = new HashMap();
        }

        @Override // io.jsonwebtoken.lang.Maps.MapBuilder
        public MapBuilder and(K k13, V v13) {
            this.data.put(k13, v13);
            return this;
        }

        @Override // io.jsonwebtoken.lang.Maps.MapBuilder
        public Map<K, V> build() {
            return java.util.Collections.unmodifiableMap(this.data);
        }
    }

    public interface MapBuilder<K, V> {
        MapBuilder and(K k13, V v13);

        Map<K, V> build();
    }

    private Maps() {
    }

    public static <K, V> MapBuilder<K, V> of(K k13, V v13) {
        return new HashMapBuilder().and(k13, v13);
    }
}
