package c2;

import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraSpeedControlView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h5 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24820i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f24821j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f24822k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5(float f13, Object obj, int i13) {
        super(1);
        this.f24820i = i13;
        this.f24821j = f13;
        this.f24822k = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f24820i;
        float f13 = this.f24821j;
        Object obj2 = this.f24822k;
        switch (i13) {
            case 0:
                long j13 = ((a3.f) obj).f497a;
                float d2 = a3.f.d(j13) * f13;
                float b13 = a3.f.b(j13) * f13;
                i2.q1 q1Var = (i2.q1) obj2;
                if (a3.f.d(((a3.f) q1Var.getValue()).f497a) != d2 || a3.f.b(((a3.f) q1Var.getValue()).f497a) != b13) {
                    q1Var.setValue(new a3.f(bs1.c.c(d2, b13)));
                }
                return Unit.f80348a;
            case 1:
                s3.m0 m0Var = (s3.m0) ((d3.e) obj);
                m0Var.a();
                if (!n4.e.a(f13, 0.0f)) {
                    d3.c cVar = m0Var.f110840a;
                    float b14 = cVar.b() * f13;
                    float b15 = a3.f.b(cVar.g()) - (b14 / 2);
                    d3.h.q0(m0Var, ((k1.y) obj2).f78092b, com.bumptech.glide.c.d(0.0f, b15), com.bumptech.glide.c.d(a3.f.d(cVar.g()), b15), b14, 0.0f, 496);
                }
                return Unit.f80348a;
            case 2:
                d6.b it = (d6.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String name = (String) obj2;
                Intrinsics.checkNotNullParameter(name, "name");
                d6.g key = new d6.g(name);
                Float valueOf = Float.valueOf(f13);
                it.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                it.c(key, valueOf);
                return Unit.f80348a;
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String string = ((IdeaPinCreationCameraSpeedControlView) obj2).getContext().getString(aq1.h.story_pin_camera_speed_multiplier_content_description, String.valueOf(f13));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return rn1.a.y(it2, null, null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.h2(string), null, null, null, null, false, null, null, 2093055);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5(Object obj, float f13, int i13) {
        super(1);
        this.f24820i = i13;
        this.f24822k = obj;
        this.f24821j = f13;
    }
}
