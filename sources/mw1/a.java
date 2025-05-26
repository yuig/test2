package mw1;

import com.pinterest.api.model.i5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m f88425a;

    /* renamed from: b, reason: collision with root package name */
    public final i5 f88426b;

    /* renamed from: c, reason: collision with root package name */
    public final List f88427c;

    public a(m splitType, i5 summaryData, ArrayList entriesList) {
        Intrinsics.checkNotNullParameter(splitType, "splitType");
        Intrinsics.checkNotNullParameter(summaryData, "summaryData");
        Intrinsics.checkNotNullParameter(entriesList, "entriesList");
        this.f88425a = splitType;
        this.f88426b = summaryData;
        this.f88427c = entriesList;
    }
}
