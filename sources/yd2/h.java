package yd2;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f138803i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f138804j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, f fVar) {
        super(0);
        this.f138803i = jVar;
        this.f138804j = fVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m293invoke() {
        GLES20.glFramebufferTexture2D(this.f138803i.f138807b.getGlValue(), 36064, 3553, this.f138804j.f138801a.f15063b, 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        m293invoke();
        return Unit.f80348a;
    }
}
