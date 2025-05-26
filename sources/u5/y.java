package u5;

import android.content.ComponentName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final List f120540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120541b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f120542c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f120543d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f120544e;

    public y(List credentialOptions, String str, boolean z13, ComponentName componentName, boolean z14) {
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        this.f120540a = credentialOptions;
        this.f120541b = str;
        this.f120542c = z13;
        this.f120543d = componentName;
        this.f120544e = z14;
        if (!(!credentialOptions.isEmpty())) {
            throw new IllegalArgumentException("credentialOptions should not be empty".toString());
        }
    }
}
