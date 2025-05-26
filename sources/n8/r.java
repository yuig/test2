package n8;

import a7.k1;
import a7.w0;
import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory;
import l7.p0;
import pk.v2;

/* loaded from: classes3.dex */
public final class r implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f89870a;

    public r(k1 k1Var) {
        this.f89870a = k1Var;
    }

    @Override // a7.w0
    public final p0 a(Context context, a7.j jVar, s sVar, k kVar, v5.x xVar, v2 v2Var) {
        try {
            return ((w0) PreviewingSingleInputVideoGraph$Factory.class.getConstructor(k1.class).newInstance(this.f89870a)).a(context, jVar, sVar, kVar, xVar, v2Var);
        } catch (Exception e13) {
            throw VideoFrameProcessingException.a(e13);
        }
    }
}
