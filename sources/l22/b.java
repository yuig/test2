package l22;

import dl1.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends u {

    /* renamed from: d, reason: collision with root package name */
    public final String f81475d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81476e;

    /* renamed from: f, reason: collision with root package name */
    public final List f81477f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String didItUid, String str, ArrayList arrayList) {
        super(didItUid);
        Intrinsics.checkNotNullParameter(didItUid, "didItUid");
        this.f81475d = didItUid;
        this.f81476e = str;
        this.f81477f = arrayList;
    }

    @Override // dl1.u
    public final String a() {
        return this.f81475d;
    }
}
