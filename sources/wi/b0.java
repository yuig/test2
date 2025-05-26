package wi;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f129930a;

    /* renamed from: b, reason: collision with root package name */
    public final String f129931b;

    /* renamed from: c, reason: collision with root package name */
    public final List f129932c;

    public b0(String str, String str2, Bundle responseExtras, List adSourceResponses) {
        Intrinsics.checkNotNullParameter(responseExtras, "responseExtras");
        Intrinsics.checkNotNullParameter(adSourceResponses, "adSourceResponses");
        this.f129930a = str;
        this.f129931b = str2;
        this.f129932c = adSourceResponses;
    }
}
