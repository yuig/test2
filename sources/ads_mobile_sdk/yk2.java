package ads_mobile_sdk;

import com.google.android.gms.ads.AdSize;
import lb.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class yk2 {

    /* renamed from: b, reason: collision with root package name */
    public static final yk2 f14301b;

    /* renamed from: c, reason: collision with root package name */
    public static final yk2 f14302c;

    /* renamed from: d, reason: collision with root package name */
    public static final yk2 f14303d;

    /* renamed from: e, reason: collision with root package name */
    public static final yk2 f14304e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yk2[] f14305f;

    /* renamed from: a, reason: collision with root package name */
    public final long f14306a;

    static {
        zn2.a aVar = zn2.b.f142311b;
        zn2.d dVar = zn2.d.MILLISECONDS;
        yk2 yk2Var = new yk2(0, dl2.b.P2(30, dVar), "FAST");
        f14301b = yk2Var;
        yk2 yk2Var2 = new yk2(1, dl2.b.P2(100, dVar), "MEDIUM");
        f14302c = yk2Var2;
        yk2 yk2Var3 = new yk2(2, dl2.b.P2(AdSize.MEDIUM_RECTANGLE_WIDTH, dVar), "SLOW");
        f14303d = yk2Var3;
        yk2 yk2Var4 = new yk2(3, dl2.b.P2(1000, dVar), "SUPER_SLOW");
        f14304e = yk2Var4;
        yk2[] yk2VarArr = {yk2Var, yk2Var2, yk2Var3, yk2Var4};
        f14305f = yk2VarArr;
        l0.b0(yk2VarArr);
    }

    public yk2(int i13, long j13, String str) {
        this.f14306a = j13;
    }

    public static yk2[] values() {
        return (yk2[]) f14305f.clone();
    }

    public final long a() {
        return this.f14306a;
    }
}
