package lt0;

import android.os.Bundle;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f84781a;

    /* renamed from: b, reason: collision with root package name */
    public String f84782b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84783c;

    /* renamed from: d, reason: collision with root package name */
    public final String f84784d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f84785e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84786f;

    /* renamed from: g, reason: collision with root package name */
    public final int f84787g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84788h;

    /* renamed from: i, reason: collision with root package name */
    public final kl1.a f84789i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84790j;

    public e(wk2.a aVar, String tabText, String str, String str2, Bundle arguments, String id3, int i13, String contentDescription, kl1.a earlyAccessScreenKey, String tabType, int i14) {
        str = (i14 & 4) != 0 ? null : str;
        str2 = (i14 & 8) != 0 ? null : str2;
        arguments = (i14 & 16) != 0 ? new Bundle() : arguments;
        contentDescription = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? "" : contentDescription;
        earlyAccessScreenKey = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? kl1.a.LateAccessScreenKey : earlyAccessScreenKey;
        tabType = (i14 & 1024) != 0 ? "" : tabType;
        Intrinsics.checkNotNullParameter(tabText, "tabText");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(earlyAccessScreenKey, "earlyAccessScreenKey");
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        this.f84781a = aVar;
        this.f84782b = tabText;
        this.f84783c = str;
        this.f84784d = str2;
        this.f84785e = arguments;
        this.f84786f = id3;
        this.f84787g = i13;
        this.f84788h = contentDescription;
        this.f84789i = earlyAccessScreenKey;
        this.f84790j = tabType;
    }
}
