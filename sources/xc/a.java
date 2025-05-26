package xc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f134533a;

    /* renamed from: b, reason: collision with root package name */
    public final List f134534b;

    /* renamed from: c, reason: collision with root package name */
    public final List f134535c;

    /* renamed from: d, reason: collision with root package name */
    public final String f134536d;

    public a(String key, List path, List selections, String parentType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(selections, "selections");
        Intrinsics.checkNotNullParameter(parentType, "parentType");
        this.f134533a = key;
        this.f134534b = path;
        this.f134535c = selections;
        this.f134536d = parentType;
    }
}
