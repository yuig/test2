package jh;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;

/* loaded from: classes3.dex */
public final class v extends androidx.appcompat.app.j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final v f76198c;

    static {
        v vVar = new v();
        vVar.f16056a = "com.google.android.gms.common.ui.SignInButtonCreatorImpl";
        f76198c = vVar;
    }

    public static View B(Context context, int i13, int i14) {
        v vVar = f76198c;
        try {
            zax zaxVar = new zax(1, i13, i14, null);
            return (View) rh.b.E(((t) vVar.s(context)).D(new rh.b(context), zaxVar));
        } catch (Exception e13) {
            throw new RemoteCreator$RemoteCreatorException(a.a.f("Could not get button with size ", i13, " and color ", i14), e13);
        }
    }

    @Override // androidx.appcompat.app.j0
    public final t r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof t ? (t) queryLocalInterface : new t(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator", 1);
    }
}
