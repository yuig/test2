package b3;

import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class v0 extends s {

    /* renamed from: a, reason: collision with root package name */
    public Shader f21376a;

    /* renamed from: b, reason: collision with root package name */
    public long f21377b = y2.h.f136670b;

    @Override // b3.s
    public final void a(float f13, long j13, i iVar) {
        Shader shader = this.f21376a;
        if (shader == null || !a3.f.a(this.f21377b, j13)) {
            if (a3.f.e(j13)) {
                shader = null;
                this.f21376a = null;
                this.f21377b = y2.h.f136670b;
            } else {
                shader = b(j13);
                this.f21376a = shader;
                this.f21377b = j13;
            }
        }
        long c13 = androidx.compose.ui.graphics.a.c(iVar.f21325a.getColor());
        long j14 = w.f21378b;
        if (!w.c(c13, j14)) {
            iVar.e(j14);
        }
        if (!Intrinsics.d(iVar.f21327c, shader)) {
            iVar.i(shader);
        }
        if (iVar.f21325a.getAlpha() / 255.0f == f13) {
            return;
        }
        iVar.c(f13);
    }

    public abstract Shader b(long j13);
}
