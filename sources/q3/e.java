package q3;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class e implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f102188a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102189b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f102190c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f102191d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f102192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f102193f;

    public e(int i13, int i14, Map map, Function1 function1, f fVar) {
        this.f102192e = function1;
        this.f102193f = fVar;
        this.f102188a = i13;
        this.f102189b = i14;
        this.f102190c = map;
    }

    @Override // q3.q0
    public final Map c() {
        return this.f102190c;
    }

    @Override // q3.q0
    public final void d() {
        this.f102192e.invoke(this.f102193f.f102203a.f111015i);
    }

    @Override // q3.q0
    public final Function1 e() {
        return this.f102191d;
    }

    @Override // q3.q0
    public final int i() {
        return this.f102189b;
    }

    @Override // q3.q0
    public final int j() {
        return this.f102188a;
    }
}
