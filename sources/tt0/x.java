package tt0;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119226i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f119227j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, int i13) {
        super(1);
        this.f119226i = i13;
        this.f119227j = zVar;
    }

    public final void b(rt0.b model) {
        int i13 = this.f119226i;
        z zVar = this.f119227j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(model, "model");
                z.a(zVar, model);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(model, "model");
                z.a(zVar, model);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(model, "model");
                z.a(zVar, model);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(model, "model");
                z.a(zVar, model);
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                z.a(zVar, model);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f119226i) {
            case 0:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int id3 = it.getId();
                int i13 = aq1.d.delete_button;
                z zVar = this.f119227j;
                if (id3 == i13) {
                    z.s(zVar, h32.u0.STORY_PIN_CAMERA_DELETE_CLIP_BUTTON);
                    zVar.f119240e.f119208a.invoke();
                } else if (id3 == aq1.d.ghost_button) {
                    zVar.f119240e.f119209b.invoke(new v(zVar, 0));
                } else if (id3 == aq1.d.record_button) {
                    int i14 = w.f119225a[zVar.f119243h.ordinal()];
                    if (i14 == 1) {
                        zVar.f119240e.f119211d.invoke(new v(zVar, 1));
                    } else if (i14 == 3) {
                        z.s(zVar, h32.u0.STORY_PIN_CAMERA_RECORD_BUTTON);
                        zVar.f119240e.f119210c.invoke();
                    } else if (i14 == 4) {
                        z.s(zVar, h32.u0.STORY_PIN_CAMERA_RECORD_BUTTON);
                        zVar.f119240e.f119216i.invoke();
                    }
                } else if (id3 == aq1.d.speed_control_button) {
                    z.s(zVar, h32.u0.STORY_PIN_CAMERA_SPEED_BUTTON);
                    zVar.f119240e.f119212e.invoke();
                } else if (id3 == aq1.d.lens_toggle_button) {
                    zVar.f119240e.f119213f.invoke(new v(zVar, 2));
                }
                break;
            case 1:
                b((rt0.b) obj);
                break;
            case 2:
                b((rt0.b) obj);
                break;
            case 3:
                b((rt0.b) obj);
                break;
            case 4:
                b((rt0.b) obj);
                break;
            default:
                b((rt0.b) obj);
                break;
        }
        return Unit.f80348a;
    }
}
