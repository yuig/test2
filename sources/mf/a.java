package mf;

import com.facebook.login.widget.DeviceLoginButton;
import com.facebook.login.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends androidx.appcompat.app.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeviceLoginButton f87065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DeviceLoginButton deviceLoginButton) {
        super(deviceLoginButton, 2);
        this.f87065c = deviceLoginButton;
    }

    @Override // androidx.appcompat.app.c
    public final x a() {
        DeviceLoginButton deviceLoginButton = this.f87065c;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            com.facebook.login.g h10 = com.facebook.login.g.h();
            com.facebook.login.c defaultAudience = deviceLoginButton.f30053l.f87068a;
            h10.getClass();
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            h10.f30079b = defaultAudience;
            com.facebook.login.j loginBehavior = com.facebook.login.j.DEVICE_AUTH;
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            h10.f30078a = loginBehavior;
            p001if.a.b(h10);
            return h10;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }
}
