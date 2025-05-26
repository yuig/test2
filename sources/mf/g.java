package mf;

import com.facebook.Profile;
import com.facebook.login.widget.ProfilePictureView;
import df.j1;
import le.k0;

/* loaded from: classes3.dex */
public final class g extends k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ProfilePictureView f87073d;

    public g(ProfilePictureView profilePictureView) {
        this.f87073d = profilePictureView;
    }

    @Override // le.k0
    public final void a(Profile profile) {
        boolean z13;
        String str = profile != null ? profile.f29918a : null;
        ProfilePictureView profilePictureView = this.f87073d;
        if (j1.V0(profilePictureView.f30067a) || !profilePictureView.f30067a.equalsIgnoreCase(str)) {
            profilePictureView.f();
            z13 = true;
        } else {
            z13 = false;
        }
        profilePictureView.f30067a = str;
        profilePictureView.d(z13);
        profilePictureView.d(true);
    }
}
