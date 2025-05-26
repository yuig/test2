package go0;

import bk.b0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends b0 {

    /* renamed from: f, reason: collision with root package name */
    public final hk0.m f65835f;

    /* renamed from: g, reason: collision with root package name */
    public final String f65836g;

    /* renamed from: h, reason: collision with root package name */
    public final String f65837h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f65838i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f65839j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f65840k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f65841l;

    /* renamed from: m, reason: collision with root package name */
    public final String f65842m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String userId, String str, String str2, boolean z13, boolean z14, hk0.m sourceLocation, String bulkMoveOriginBoardId, String str3, ArrayList arrayList, boolean z15, ArrayList arrayList2, boolean z16, String str4, boolean z17) {
        super(userId, str, str2, z13, z14);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(sourceLocation, "sourceLocation");
        Intrinsics.checkNotNullParameter(bulkMoveOriginBoardId, "bulkMoveOriginBoardId");
        this.f65835f = sourceLocation;
        this.f65836g = bulkMoveOriginBoardId;
        this.f65837h = str3;
        this.f65838i = arrayList;
        this.f65839j = z15;
        this.f65840k = arrayList2;
        this.f65841l = z16;
        this.f65842m = str4;
    }
}
