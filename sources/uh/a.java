package uh;

import ch.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: k, reason: collision with root package name */
    public static final x92.b f122238k = new x92.b("Fido.FIDO2_API", new c(8), new d());

    public final Task e(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        q a13 = r.a();
        a13.f30859c = new bh.b(1, this, publicKeyCredentialCreationOptions);
        a13.f30857a = 5407;
        return d(0, a13.a());
    }
}
