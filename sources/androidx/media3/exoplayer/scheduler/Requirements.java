package androidx.media3.exoplayer.scheduler;

import android.os.Parcel;
import android.os.Parcelable;
import c8.a;

/* loaded from: classes3.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f18842a;

    public Requirements(int i13) {
        this.f18842a = (i13 & 2) != 0 ? i13 | 1 : i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r6.hasCapability(16) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(android.content.Context r9) {
        /*
            r8 = this;
            int r0 = r8.f18842a
            r1 = r0 & 1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r3
        Lb:
            r4 = 16
            r5 = 2
            if (r1 != 0) goto L12
        L10:
            r1 = r3
            goto L51
        L12:
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r9.getSystemService(r1)
            r1.getClass()
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L4f
            boolean r6 = r6.isConnected()
            if (r6 == 0) goto L4f
            int r6 = d7.n0.f53866a
            r7 = 24
            if (r6 >= r7) goto L30
            goto L43
        L30:
            android.net.Network r6 = r1.getActiveNetwork()
            if (r6 != 0) goto L37
            goto L4f
        L37:
            android.net.NetworkCapabilities r6 = r1.getNetworkCapabilities(r6)     // Catch: java.lang.SecurityException -> L43
            if (r6 == 0) goto L4f
            boolean r6 = r6.hasCapability(r4)     // Catch: java.lang.SecurityException -> L43
            if (r6 == 0) goto L4f
        L43:
            r6 = r0 & 2
            if (r6 == 0) goto L10
            boolean r1 = r1.isActiveNetworkMetered()
            if (r1 == 0) goto L10
            r1 = r5
            goto L51
        L4f:
            r1 = r0 & 3
        L51:
            r6 = r0 & 8
            if (r6 == 0) goto L56
            goto L57
        L56:
            r2 = r3
        L57:
            r3 = 0
            if (r2 == 0) goto L77
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r6)
            android.content.Intent r2 = r9.registerReceiver(r3, r2)
            if (r2 != 0) goto L68
            goto L75
        L68:
            java.lang.String r6 = "status"
            r7 = -1
            int r2 = r2.getIntExtra(r6, r7)
            if (r2 == r5) goto L77
            r5 = 5
            if (r2 != r5) goto L75
            goto L77
        L75:
            r1 = r1 | 8
        L77:
            r2 = r0 & 4
            if (r2 == 0) goto L9c
            java.lang.String r2 = "power"
            java.lang.Object r2 = r9.getSystemService(r2)
            r2.getClass()
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            int r5 = d7.n0.f53866a
            r6 = 23
            if (r5 < r6) goto L93
            boolean r2 = r2.isDeviceIdleMode()
            if (r2 != 0) goto L9c
            goto L9a
        L93:
            boolean r2 = r2.isInteractive()
            if (r2 != 0) goto L9a
            goto L9c
        L9a:
            r1 = r1 | 4
        L9c:
            r0 = r0 & r4
            if (r0 == 0) goto Laf
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            r0.<init>(r2)
            android.content.Intent r9 = r9.registerReceiver(r3, r0)
            if (r9 != 0) goto Lad
            goto Laf
        Lad:
            r1 = r1 | 16
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.scheduler.Requirements.a(android.content.Context):int");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Requirements.class != obj.getClass()) {
            return false;
        }
        return this.f18842a == ((Requirements) obj).f18842a;
    }

    public final int hashCode() {
        return this.f18842a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f18842a);
    }
}
