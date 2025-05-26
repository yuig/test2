package e;

import android.opengl.GLES20;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import q91.o0;

/* loaded from: classes2.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56674i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f56675j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f56676k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, boolean z13, int i13) {
        super(0);
        this.f56674i = i13;
        this.f56676k = obj;
        this.f56675j = z13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f56674i) {
            case 0:
                m131invoke();
                break;
            case 1:
                m131invoke();
                break;
            case 2:
                m131invoke();
                break;
            default:
                m131invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m131invoke() {
        int i13 = this.f56674i;
        boolean z13 = this.f56675j;
        Object obj = this.f56676k;
        switch (i13) {
            case 0:
                ((h) obj).setEnabled(z13);
                break;
            case 1:
                ((Function1) obj).invoke(Boolean.valueOf(!z13));
                break;
            case 2:
                o0 o0Var = (o0) obj;
                int i14 = o0.f103151s0;
                o0Var.e8(z13);
                o0Var.a8(g0.CONFIRM_USER_BIRTHDAY_PROMPT, u0.ACCEPT_BUTTON);
                break;
            default:
                GLES20.glUniform1i(((androidx.appcompat.widget.a) obj).f16502a, z13 ? 1 : 0);
                break;
        }
    }
}
