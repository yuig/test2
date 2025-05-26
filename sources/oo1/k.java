package oo1;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f96858a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f96859b;

    static {
        Pattern compile = Pattern.compile("(?!.*[@])((https?://)?(www\\.)?)(pin\\.it)(\\/[\\S]*)?|(?!.*[@])((https?://)?(www\\.)?)(\\w+\\.pinterest\\.|pinterest\\.)((com|se|ph|pt|de|jp|co\\.kr|dk|com\\.mx|at|co\\.uk|ie|ca|fr|ch|com\\.au|nz|cl|es|it|ru|com\\.pe|com\\.uy|com\\.py))(\\/[\\S]*)?");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        f96858a = compile;
        Pattern compile2 = Pattern.compile("(?!.*[@])((https?://)?(www\\.)?)(pin\\.it)(\\/[\\S]*)?|(?!.*[@])((https?://)?(www\\.)?)(\\w+\\.pinterest\\.|pinterest\\.)((com|se|ph|pt|de|jp|co\\.kr|dk|com\\.mx|at|co\\.uk|ie|ca|fr|ch|com\\.au|nz|cl|es|it|ru|com\\.pe|com\\.uy|com\\.py))(\\/pin\\/[\\S]*)?");
        Intrinsics.checkNotNullExpressionValue(compile2, "compile(...)");
        f96859b = compile2;
    }
}
