package ck2;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public enum d implements Callable {
    INSTANCE;

    @Override // java.util.concurrent.Callable
    public Set<Object> call() {
        return new HashSet();
    }
}
