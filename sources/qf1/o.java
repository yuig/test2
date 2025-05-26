package qf1;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final Map f103759a;

    public o(Map map, int i13) {
        this.f103759a = (i13 & 2) != 0 ? null : map;
    }

    public abstract String a();

    public abstract Map b();

    public abstract boolean c();
}
