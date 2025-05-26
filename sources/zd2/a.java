package zd2;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141782i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ bn0.a f141783j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(bn0.a aVar, int i13) {
        super(0);
        this.f141782i = i13;
        this.f141783j = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f141782i) {
            case 0:
                m301invoke();
                break;
            case 1:
                m301invoke();
                break;
            case 2:
                m301invoke();
                break;
            default:
                m301invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m301invoke() {
        int i13 = this.f141782i;
        bn0.a aVar = this.f141783j;
        switch (i13) {
            case 0:
                GLES20.glAttachShader(aVar.f23559b, ((d) aVar.f23560c).f141787b);
                break;
            case 1:
                GLES20.glAttachShader(aVar.f23559b, ((d) aVar.f23561d).f141787b);
                break;
            case 2:
                GLES20.glLinkProgram(aVar.f23559b);
                break;
            default:
                GLES20.glDeleteProgram(aVar.f23559b);
                break;
        }
    }
}
