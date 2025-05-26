package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import oi.e7;

/* loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new e7(9);

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f33739f;

    /* renamed from: g, reason: collision with root package name */
    public g1.g f33740g;

    public RemoteMessage(Bundle bundle) {
        this.f33739f = bundle;
    }

    public final Map e() {
        if (this.f33740g == null) {
            g1.g gVar = new g1.g(0);
            Bundle bundle = this.f33739f;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        gVar.put(str, str2);
                    }
                }
            }
            this.f33740g = gVar;
        }
        return this.f33740g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = bs1.c.M2(parcel, 20293);
        bs1.c.A2(parcel, 2, this.f33739f);
        bs1.c.N2(parcel, M2);
    }
}
