package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/pinterest/api/model/sp;", "Lcom/pinterest/api/model/wx;", "Lcom/pinterest/api/model/do;", "a", "Lcom/pinterest/api/model/do;", "e", "()Lcom/pinterest/api/model/do;", "musicItem", "<init>", "(Lcom/pinterest/api/model/do;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class sp extends wx {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("musicItem")
    private final Cdo musicItem;

    public sp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean a() {
        return this.musicItem != null;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        return String.valueOf(hashCode());
    }

    /* renamed from: e, reason: from getter */
    public final Cdo getMusicItem() {
        return this.musicItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(sp.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.musicItem, ((sp) obj).musicItem);
    }

    public final sp g(long j13) {
        Cdo cdo = this.musicItem;
        return cdo != null ? new sp(cdo.f(j13)) : this;
    }

    public final int hashCode() {
        Cdo cdo = this.musicItem;
        if (cdo == null) {
            return 0;
        }
        return cdo.hashCode();
    }

    public final String toString() {
        return "IdeaPinLocalAudioList(musicItem=" + this.musicItem + ")";
    }

    public /* synthetic */ sp(Cdo cdo, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : cdo);
    }

    public sp(Cdo cdo) {
        this.musicItem = cdo;
    }
}
