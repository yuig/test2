package v;

import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class l0 implements q.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123533a;

    public /* synthetic */ l0(int i13) {
        this.f123533a = i13;
    }

    @Override // q.a
    public final Object apply(Object obj) {
        switch (this.f123533a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                int i13 = z0.f123750g;
                return Boolean.FALSE;
            case 4:
                int i14 = b1.f123363h;
                return Boolean.FALSE;
            case 5:
                return null;
            case 6:
                c0.c0 c0Var = c0.i0.f24252z;
                return null;
            case 7:
                return new l0.i((c0.z) obj);
            default:
                try {
                    return a1.b.k(null, y0.g0.B((y0.e) obj));
                } catch (InvalidConfigException e13) {
                    kh2.m0.Y0("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e13);
                    return null;
                }
        }
    }
}
