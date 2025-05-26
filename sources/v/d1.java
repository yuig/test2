package v;

import android.media.CamcorderProfile;

/* loaded from: classes2.dex */
public final class d1 implements d {
    @Override // v.d
    public final CamcorderProfile a(int i13, int i14) {
        return CamcorderProfile.get(i13, i14);
    }

    @Override // v.d
    public final boolean b(int i13, int i14) {
        return CamcorderProfile.hasProfile(i13, i14);
    }
}
