package fh;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class e extends jh.h {

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInOptions f62140e;

    public e(Context context, Looper looper, jh.g gVar, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.g gVar2, com.google.android.gms.common.api.h hVar) {
        super(context, looper, 91, gVar, gVar2, hVar);
        eh.b bVar;
        if (googleSignInOptions != null) {
            bVar = new eh.b();
            bVar.f58903a = new HashSet();
            bVar.f58910h = new HashMap();
            bVar.f58903a = new HashSet(googleSignInOptions.f30704g);
            bVar.f58904b = googleSignInOptions.f30707j;
            bVar.f58905c = googleSignInOptions.f30708k;
            bVar.f58906d = googleSignInOptions.f30706i;
            bVar.f58907e = googleSignInOptions.f30709l;
            bVar.f58908f = googleSignInOptions.f30705h;
            bVar.f58909g = googleSignInOptions.f30710m;
            bVar.f58910h = GoogleSignInOptions.f(googleSignInOptions.f30711n);
            bVar.f58911i = googleSignInOptions.f30712o;
        } else {
            bVar = new eh.b();
        }
        bVar.f58911i = ai.j.a();
        Set<Scope> set = gVar.f76146c;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.f58903a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.f62140e = bVar.a();
    }

    @Override // jh.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 0);
    }

    @Override // jh.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // jh.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // jh.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
