package yd2;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class l extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138811i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f138812j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(k kVar, int i13) {
        super(0);
        this.f138811i = i13;
        this.f138812j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        k kVar = this.f138812j;
        int i13 = this.f138811i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        GLES20.glBindFramebuffer(36008, kVar.f138809a);
                        break;
                    default:
                        GLES20.glBindFramebuffer(36009, kVar.f138810b);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        GLES20.glBindFramebuffer(36008, kVar.f138809a);
                        break;
                    default:
                        GLES20.glBindFramebuffer(36009, kVar.f138810b);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
