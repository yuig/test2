package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final s f96590a;

    /* renamed from: b, reason: collision with root package name */
    public final s f96591b;

    /* renamed from: c, reason: collision with root package name */
    public final s f96592c;

    /* renamed from: d, reason: collision with root package name */
    public final s f96593d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96594e;

    static {
        s sVar = s.f96582c;
        new t(sVar, sVar, sVar, sVar, 16);
        s sVar2 = s.f96583d;
        new t(sVar2, sVar2, sVar2, sVar2, 16);
        s sVar3 = s.f96584e;
        new t(sVar3, sVar3, sVar3, sVar3, 16);
    }

    public t(s addCollaboratorAction, s messageAction, s shareAction, s moreAction, int i13) {
        int i14 = i13 & 1;
        s sVar = s.f96584e;
        addCollaboratorAction = i14 != 0 ? sVar : addCollaboratorAction;
        messageAction = (i13 & 2) != 0 ? sVar : messageAction;
        int i15 = i13 & 4;
        s sVar2 = s.f96582c;
        shareAction = i15 != 0 ? sVar2 : shareAction;
        moreAction = (i13 & 8) != 0 ? sVar2 : moreAction;
        Intrinsics.checkNotNullParameter(addCollaboratorAction, "addCollaboratorAction");
        Intrinsics.checkNotNullParameter(messageAction, "messageAction");
        Intrinsics.checkNotNullParameter(shareAction, "shareAction");
        Intrinsics.checkNotNullParameter(moreAction, "moreAction");
        this.f96590a = addCollaboratorAction;
        this.f96591b = messageAction;
        this.f96592c = shareAction;
        this.f96593d = moreAction;
        this.f96594e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f96590a, tVar.f96590a) && Intrinsics.d(this.f96591b, tVar.f96591b) && Intrinsics.d(this.f96592c, tVar.f96592c) && Intrinsics.d(this.f96593d, tVar.f96593d) && this.f96594e == tVar.f96594e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96594e) + ((this.f96593d.hashCode() + ((this.f96592c.hashCode() + ((this.f96591b.hashCode() + (this.f96590a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardTopBarActions(addCollaboratorAction=");
        sb3.append(this.f96590a);
        sb3.append(", messageAction=");
        sb3.append(this.f96591b);
        sb3.append(", shareAction=");
        sb3.append(this.f96592c);
        sb3.append(", moreAction=");
        sb3.append(this.f96593d);
        sb3.append(", visible=");
        return a.a.r(sb3, this.f96594e, ")");
    }
}
