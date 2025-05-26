package com.pinterest.api.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.pinterest.api.model.deserializer.PinDeserializer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class PinFeed extends Feed<f30> {
    public static final Parcelable.Creator<PinFeed> CREATOR = new c40();

    /* renamed from: l, reason: collision with root package name */
    public HashSet f35563l;

    public PinFeed() {
        super(null, null);
        this.f35563l = new HashSet();
    }

    @Override // com.pinterest.api.model.Feed
    public final void D() {
        if (this.f35557i == null) {
            return;
        }
        ArrayList arrayList = this.f35559k;
        if (arrayList == null) {
            this.f35559k = new ArrayList();
        } else {
            arrayList.clear();
        }
        HashSet hashSet = this.f35563l;
        if (hashSet == null) {
            this.f35563l = new HashSet();
        } else {
            hashSet.clear();
        }
        for (f30 f30Var : this.f35557i) {
            String id3 = f30Var.getId();
            this.f35563l.add(id3);
            if (f30Var.F3() != null) {
                this.f35563l.add(f30Var.F3());
            }
            if (!pk.a0.x0(f30Var.z4())) {
                this.f35563l.add(f30Var.z4());
            }
            this.f35559k.add(id3);
        }
    }

    @Override // com.pinterest.api.model.Feed
    public final void E(Bundle bundle) {
        gw gwVar = fw.f37821a;
        ArrayList arrayList = this.f35559k;
        gwVar.getClass();
        ArrayList e13 = gw.e(arrayList, true);
        Bundle bundle2 = bundle.getBundle("HIDDEN_PINS_SAVED_STATE_KEY");
        if (bundle2 != null && !bundle2.isEmpty()) {
            Iterator it = e13.iterator();
            while (it.hasNext()) {
                f30 f30Var = (f30) it.next();
                String id3 = f30Var.getId();
                if (!pk.a0.x0(id3) && bundle2.containsKey(id3)) {
                    wa2.p pVar = (wa2.p) bundle2.getSerializable(id3);
                    if (pVar != null) {
                        gb2.f fVar = gb2.f.f64747a;
                        gb2.f.c(new gb2.i(id3, pVar, wa2.o.UI_ONLY));
                    }
                    b40.Z0(f30Var, d40.COMPLETE_HIDDEN);
                }
            }
        }
        H(e13);
    }

    @Override // com.pinterest.api.model.Feed
    public final void G(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        for (f30 f30Var : q()) {
            if (f30Var != null && b40.x(f30Var) != d40.NOT_HIDDEN) {
                bundle2.putSerializable(f30Var.getId(), wa2.p.STATE_NO_FEEDBACK);
            }
        }
        bundle.putBundle("HIDDEN_PINS_SAVED_STATE_KEY", bundle2);
    }

    public final void I(f30 f30Var) {
        List list = this.f35557i;
        if (list == null || list.size() < 0 || y(f30Var)) {
            return;
        }
        h(f30Var);
        this.f35563l.add(f30Var.getId());
        if (f30Var.F3() != null) {
            this.f35563l.add(f30Var.F3());
        }
    }

    @Override // com.pinterest.api.model.Feed
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final boolean y(f30 f30Var) {
        return this.f35563l.contains(f30Var.getId()) || (f30Var.F3() != null && this.f35563l.contains(f30Var.F3()));
    }

    @Override // com.pinterest.api.model.Feed
    public final void j(Feed feed) {
        this.f105383c = feed.f105383c;
        this.f105387g = feed.f105387g;
        this.f105382b = feed.f105382b;
        this.f105384d = feed.f105384d;
        if (!v()) {
            B();
            H(feed.q());
            return;
        }
        List q13 = q();
        n();
        int n13 = feed.n();
        for (int i13 = 0; i13 < n13; i13++) {
            q13.add((f30) feed.k(i13));
        }
        H(q13);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        gw gwVar = fw.f37821a;
        ArrayList arrayList = this.f35559k;
        gwVar.getClass();
        return gw.e(arrayList, false);
    }

    public PinFeed(vd0.c cVar, String str, b22.c cVar2) {
        super(cVar, str);
        this.f35563l = new HashSet();
        if (cVar == null) {
            return;
        }
        Object obj = this.f105381a;
        if (obj instanceof vd0.a) {
            H(((PinDeserializer) cVar2).c((vd0.a) obj));
        } else {
            H(new ArrayList());
        }
        g(null);
    }

    public PinFeed(Parcel parcel) {
        super(null, null);
        this.f35563l = new HashSet();
        C(parcel);
    }

    public PinFeed(@NonNull PinFeed pinFeed) {
        super(pinFeed);
        this.f35563l = new HashSet();
    }
}
