package zd2;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141784i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f141785j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f141784i = i13;
        this.f141785j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        d dVar = this.f141785j;
        int i13 = this.f141784i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        GLES20.glShaderSource(dVar.f141787b, dVar.f141786a);
                        break;
                    default:
                        GLES20.glCompileShader(dVar.f141787b);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        GLES20.glShaderSource(dVar.f141787b, dVar.f141786a);
                        break;
                    default:
                        GLES20.glCompileShader(dVar.f141787b);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
