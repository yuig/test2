package hr1;

import com.facebook.Profile;
import com.pinterest.identity.core.error.UnauthException;
import kotlin.jvm.internal.Intrinsics;
import le.k0;
import uj2.c0;

/* loaded from: classes4.dex */
public final class a extends k0 {

    /* renamed from: d, reason: collision with root package name */
    public final c0 f69982d;

    public a(kk2.a emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f69982d = emitter;
    }

    @Override // le.k0
    public final void a(Profile profile) {
        c0 c0Var = this.f69982d;
        if (profile != null) {
            try {
                if (this.f83068c) {
                    this.f83067b.d(this.f83066a);
                    this.f83068c = false;
                }
                ((kk2.a) c0Var).b(profile);
            } catch (Exception e13) {
                ((kk2.a) c0Var).c(new UnauthException.ThirdParty.Facebook.ProfileFailureError(e13));
            }
        }
    }
}
