package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.d1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public final class j implements MatchResult {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f80493a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f80494b;

    /* renamed from: c, reason: collision with root package name */
    public final i f80495c;

    /* renamed from: d, reason: collision with root package name */
    public d1 f80496d;

    public j(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f80493a = matcher;
        this.f80494b = input;
        this.f80495c = new i(this);
    }

    @Override // kotlin.text.MatchResult
    public final IntRange a() {
        Matcher matcher = this.f80493a;
        return ql2.s.q(matcher.start(), matcher.end());
    }

    public final List b() {
        if (this.f80496d == null) {
            this.f80496d = new d1(this);
        }
        d1 d1Var = this.f80496d;
        Intrinsics.f(d1Var);
        return d1Var;
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String group = this.f80493a.group();
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return group;
    }

    @Override // kotlin.text.MatchResult
    public final j next() {
        Matcher matcher = this.f80493a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f80494b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        if (matcher2.find(end)) {
            return new j(matcher2, charSequence);
        }
        return null;
    }
}
