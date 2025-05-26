package jk;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f76320a;

    /* renamed from: b, reason: collision with root package name */
    public final int f76321b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76322c;

    /* renamed from: d, reason: collision with root package name */
    public final long f76323d;

    /* renamed from: e, reason: collision with root package name */
    public final long f76324e;

    /* renamed from: f, reason: collision with root package name */
    public final List f76325f;

    /* renamed from: g, reason: collision with root package name */
    public final List f76326g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f76327h;

    /* renamed from: i, reason: collision with root package name */
    public final List f76328i;

    public d(int i13, int i14, int i15, long j13, long j14, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f76320a = i13;
        this.f76321b = i14;
        this.f76322c = i15;
        this.f76323d = j13;
        this.f76324e = j14;
        this.f76325f = list;
        this.f76326g = list2;
        this.f76327h = pendingIntent;
        this.f76328i = list3;
    }

    public static d a(int i13, int i14, int i15, long j13, long j14, List list, List list2) {
        if (i14 != 8) {
            return new d(i13, i14, i15, j13, j14, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static d b(Bundle bundle) {
        return new d(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f76320a == dVar.f76320a && this.f76321b == dVar.f76321b && this.f76322c == dVar.f76322c && this.f76323d == dVar.f76323d && this.f76324e == dVar.f76324e) {
                List list = dVar.f76325f;
                List list2 = this.f76325f;
                if (list2 != null ? list2.equals(list) : list == null) {
                    List list3 = dVar.f76326g;
                    List list4 = this.f76326g;
                    if (list4 != null ? list4.equals(list3) : list3 == null) {
                        PendingIntent pendingIntent = dVar.f76327h;
                        PendingIntent pendingIntent2 = this.f76327h;
                        if (pendingIntent2 != null ? pendingIntent2.equals(pendingIntent) : pendingIntent == null) {
                            List list5 = dVar.f76328i;
                            List list6 = this.f76328i;
                            if (list6 != null ? list6.equals(list5) : list5 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = ((((this.f76320a ^ 1000003) * 1000003) ^ this.f76321b) * 1000003) ^ this.f76322c;
        long j13 = this.f76323d;
        long j14 = j13 ^ (j13 >>> 32);
        long j15 = this.f76324e;
        long j16 = (j15 >>> 32) ^ j15;
        List list = this.f76325f;
        int hashCode = ((((((i13 * 1000003) ^ ((int) j14)) * 1000003) ^ ((int) j16)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f76326g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f76327h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f76328i;
        return hashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f76325f);
        String valueOf2 = String.valueOf(this.f76326g);
        String valueOf3 = String.valueOf(this.f76327h);
        String valueOf4 = String.valueOf(this.f76328i);
        StringBuilder sb3 = new StringBuilder("SplitInstallSessionState{sessionId=");
        sb3.append(this.f76320a);
        sb3.append(", status=");
        sb3.append(this.f76321b);
        sb3.append(", errorCode=");
        sb3.append(this.f76322c);
        sb3.append(", bytesDownloaded=");
        sb3.append(this.f76323d);
        sb3.append(", totalBytesToDownload=");
        sb3.append(this.f76324e);
        sb3.append(", moduleNamesNullable=");
        sb3.append(valueOf);
        a.a.B(sb3, ", languagesNullable=", valueOf2, ", resolutionIntent=", valueOf3);
        sb3.append(", splitFileIntents=");
        sb3.append(valueOf4);
        sb3.append("}");
        return sb3.toString();
    }
}
