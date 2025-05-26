package h11;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f66457a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66458b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66459c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66460d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f66461e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f66462f;

    /* renamed from: g, reason: collision with root package name */
    public final int f66463g;

    /* renamed from: h, reason: collision with root package name */
    public final String f66464h;

    /* renamed from: i, reason: collision with root package name */
    public final List f66465i;

    public d(String str, String boardName, String str2, String description, boolean z13, boolean z14, int i13, String str3, List suggestedBoards) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(suggestedBoards, "suggestedBoards");
        this.f66457a = str;
        this.f66458b = boardName;
        this.f66459c = str2;
        this.f66460d = description;
        this.f66461e = z13;
        this.f66462f = z14;
        this.f66463g = i13;
        this.f66464h = str3;
        this.f66465i = suggestedBoards;
    }

    public final String a() {
        return this.f66457a;
    }

    public final String b() {
        return this.f66458b;
    }

    public final String c() {
        return this.f66460d;
    }

    public final String d() {
        return this.f66459c;
    }

    public final boolean e() {
        return this.f66462f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f66457a, dVar.f66457a) && Intrinsics.d(this.f66458b, dVar.f66458b) && Intrinsics.d(this.f66459c, dVar.f66459c) && Intrinsics.d(this.f66460d, dVar.f66460d) && this.f66461e == dVar.f66461e && this.f66462f == dVar.f66462f && this.f66463g == dVar.f66463g && Intrinsics.d(this.f66464h, dVar.f66464h) && Intrinsics.d(this.f66465i, dVar.f66465i);
    }

    public final int hashCode() {
        String str = this.f66457a;
        int d2 = cb.d(this.f66458b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f66459c;
        int b13 = ep.b.b(this.f66463g, ep.b.e(this.f66462f, ep.b.e(this.f66461e, cb.d(this.f66460d, (d2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31);
        String str3 = this.f66464h;
        return this.f66465i.hashCode() + ((b13 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RepinToBoardMetadata(boardId=");
        sb3.append(this.f66457a);
        sb3.append(", boardName=");
        sb3.append(this.f66458b);
        sb3.append(", imageUrl=");
        sb3.append(this.f66459c);
        sb3.append(", description=");
        sb3.append(this.f66460d);
        sb3.append(", isBoardCreatedFromSuggestedName=");
        sb3.append(this.f66461e);
        sb3.append(", isNewlyCreatedBoard=");
        sb3.append(this.f66462f);
        sb3.append(", boardListPosition=");
        sb3.append(this.f66463g);
        sb3.append(", boardSectionId=");
        sb3.append(this.f66464h);
        sb3.append(", suggestedBoards=");
        return a.c.j(sb3, this.f66465i, ")");
    }
}
