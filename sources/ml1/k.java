package ml1;

import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87527i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f87528j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f87529k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, float f13, int i13) {
        super(0);
        this.f87527i = i13;
        this.f87529k = obj;
        this.f87528j = f13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f13 = this.f87528j;
        Object obj = this.f87529k;
        int i13 = this.f87527i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        View view = (View) obj;
                        if (view != null) {
                            view.setX(f13);
                            break;
                        }
                        break;
                    default:
                        GLES20.glUniform1f(((androidx.appcompat.widget.a) obj).f16502a, f13);
                        break;
                }
                return Unit.f80348a;
            case 1:
                switch (i13) {
                    case 0:
                        View view2 = (View) obj;
                        if (view2 != null) {
                            view2.setX(f13);
                            break;
                        }
                        break;
                    default:
                        GLES20.glUniform1f(((androidx.appcompat.widget.a) obj).f16502a, f13);
                        break;
                }
                return Unit.f80348a;
            default:
                return Boolean.valueOf(EGLExt.eglPresentationTimeANDROID(xd2.b.f134641a, (EGLSurface) ((g01.a) ((androidx.camera.core.impl.j) obj).f16878e).f63225b, (long) (f13 * 1.0E9d)));
        }
    }
}
