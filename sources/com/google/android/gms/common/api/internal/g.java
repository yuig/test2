package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.SplitInstallException;

/* loaded from: classes3.dex */
public abstract class g extends bi.a {
    @Override // bi.a
    public boolean B(int i13, Parcel parcel, Parcel parcel2) {
        if (i13 != 1) {
            return false;
        }
        Status status = (Status) bi.b.a(parcel, Status.CREATOR);
        bi.b.b(parcel);
        lb.l0.l1(status, null, ((ai.e) this).f15220b);
        return true;
    }

    @Override // bi.a
    public boolean C(int i13, Parcel parcel) {
        switch (i13) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) kk.r.a(parcel, Bundle.CREATOR);
                kk.r.b(parcel);
                ((jk.j) this).E(readInt, bundle);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                kk.r.b(parcel);
                jk.k kVar = (jk.k) this;
                kVar.f76345c.f76349b.c(kVar.f76344b);
                jk.l.f76346c.g("onCompleteInstall(%d)", Integer.valueOf(readInt2));
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                kk.r.b(parcel);
                jk.k kVar2 = (jk.k) this;
                kVar2.f76345c.f76349b.c(kVar2.f76344b);
                jk.l.f76346c.g("onCancelInstall(%d)", Integer.valueOf(readInt3));
                return true;
            case 5:
                int readInt4 = parcel.readInt();
                kk.r.b(parcel);
                jk.k kVar3 = (jk.k) this;
                kVar3.f76345c.f76349b.c(kVar3.f76344b);
                jk.l.f76346c.g("onGetSession(%d)", Integer.valueOf(readInt4));
                return true;
            case 6:
                Bundle bundle2 = (Bundle) kk.r.a(parcel, Bundle.CREATOR);
                kk.r.b(parcel);
                jk.k kVar4 = (jk.k) this;
                kk.c cVar = kVar4.f76345c.f76349b;
                TaskCompletionSource taskCompletionSource = kVar4.f76344b;
                cVar.c(taskCompletionSource);
                int i14 = bundle2.getInt("error_code");
                jk.l.f76346c.c("onError(%d)", Integer.valueOf(i14));
                taskCompletionSource.trySetException(new SplitInstallException(i14));
                return true;
            case 7:
                parcel.createTypedArrayList(Bundle.CREATOR);
                kk.r.b(parcel);
                jk.k kVar5 = (jk.k) this;
                kVar5.f76345c.f76349b.c(kVar5.f76344b);
                jk.l.f76346c.g("onGetSessionStates", new Object[0]);
                return true;
            case 8:
                Bundle bundle3 = (Bundle) kk.r.a(parcel, Bundle.CREATOR);
                kk.r.b(parcel);
                ((jk.j) this).D(bundle3);
                return true;
            case 9:
                kk.r.b(parcel);
                jk.k kVar6 = (jk.k) this;
                kVar6.f76345c.f76349b.c(kVar6.f76344b);
                jk.l.f76346c.g("onDeferredInstall", new Object[0]);
                return true;
            case 10:
                kk.r.b(parcel);
                jk.k kVar7 = (jk.k) this;
                kVar7.f76345c.f76349b.c(kVar7.f76344b);
                jk.l.f76346c.g("onGetSplitsForAppUpdate", new Object[0]);
                return true;
            case 11:
                kk.r.b(parcel);
                jk.k kVar8 = (jk.k) this;
                kVar8.f76345c.f76349b.c(kVar8.f76344b);
                jk.l.f76346c.g("onCompleteInstallForAppUpdate", new Object[0]);
                return true;
            case 12:
                kk.r.b(parcel);
                jk.k kVar9 = (jk.k) this;
                kVar9.f76345c.f76349b.c(kVar9.f76344b);
                jk.l.f76346c.g("onDeferredLanguageInstall", new Object[0]);
                return true;
            case 13:
                kk.r.b(parcel);
                jk.k kVar10 = (jk.k) this;
                kVar10.f76345c.f76349b.c(kVar10.f76344b);
                jk.l.f76346c.g("onDeferredLanguageUninstall", new Object[0]);
                return true;
            default:
                return false;
        }
    }
}
