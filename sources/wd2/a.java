package wd2;

import android.opengl.GLES20;
import he.b;
import java.nio.Buffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129232i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f129233j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(0);
        this.f129232i = i13;
        this.f129233j = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f129232i) {
            case 0:
                m281invoke();
                break;
            case 1:
                m281invoke();
                break;
            default:
                m281invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m281invoke() {
        int i13 = this.f129232i;
        b bVar = this.f129233j;
        switch (i13) {
            case 0:
                GLES20.glEnableVertexAttribArray(bVar.f68937c);
                break;
            case 1:
                GLES20.glVertexAttribPointer(bVar.f68937c, bVar.f68936b, 5126, false, 0, (Buffer) bVar.f68938d);
                break;
            default:
                GLES20.glDisableVertexAttribArray(bVar.f68937c);
                bVar.f68937c = 0;
                break;
        }
    }
}
