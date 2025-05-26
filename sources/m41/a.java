package m41;

import a41.x;
import a62.e;
import ha2.a0;
import ha2.w;
import ha2.z;
import java.util.ArrayList;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import nz1.f;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f85827a = new a0(f.profile_edit_cover_image, 1, null, null, null, null, null, null, null, 1020);

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f85828b = new a0(f.profile_add_cover_image, 1, null, null, null, null, null, null, null, 1020);

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f85829c = new a0(f.settings, 0, null, null, null, null, null, null, null, 1020);

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f85830d = new a0(f.profile_copy_link, 2, null, null, null, null, null, null, null, 1020);

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f85831e = new a0(e.share_simple, 4, null, null, null, null, null, null, null, 1020);

    /* renamed from: f, reason: collision with root package name */
    public static final a0 f85832f = new a0(f.edit_public_profile, 3, null, null, new w(f.new_feature), null, null, null, null, 1004);

    public static final ha2.a a(ArrayList options, x optionSelection) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(optionSelection, "optionSelection");
        return new ha2.a(e0.b(new z(new ha2.x(f.profile, null, null, null, null, 30), options, optionSelection)), false, (Integer) null, 14);
    }
}
