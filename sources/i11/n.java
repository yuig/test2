package i11;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f71026a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71027b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71028c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71029d;

    /* renamed from: e, reason: collision with root package name */
    public final String f71030e;

    public n(int i13, String boardId, String boardName, String description, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f71026a = boardId;
        this.f71027b = boardName;
        this.f71028c = description;
        this.f71029d = i13;
        this.f71030e = str;
    }
}
