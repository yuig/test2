package zd2;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141788i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a f141789j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f141790k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i13, androidx.appcompat.widget.a aVar) {
        super(0);
        this.f141790k = i13;
        this.f141789j = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f141788i;
        int i14 = this.f141790k;
        androidx.appcompat.widget.a aVar = this.f141789j;
        switch (i13) {
            case 0:
                return Integer.valueOf(GLES20.glGetUniformLocation(i14, (String) aVar.f16504c));
            default:
                GLES20.glUniform1i(aVar.f16502a, i14);
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.widget.a aVar, int i13) {
        super(0);
        this.f141789j = aVar;
        this.f141790k = i13;
    }
}
