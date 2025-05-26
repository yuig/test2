package yd2;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138798i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f138799j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j jVar, int i13) {
        super(0);
        this.f138798i = i13;
        this.f138799j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f138798i) {
            case 0:
                m292invoke();
                break;
            case 1:
                m292invoke();
                break;
            default:
                m292invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m292invoke() {
        int i13 = this.f138798i;
        j jVar = this.f138799j;
        switch (i13) {
            case 0:
                GLES20.glGenFramebuffers(1, jVar.f138806a, 0);
                break;
            case 1:
                GLES20.glBindFramebuffer(jVar.f138807b.getGlValue(), jVar.f138806a[0]);
                break;
            default:
                GLES20.glDeleteFramebuffers(1, jVar.f138806a, 0);
                break;
        }
    }
}
