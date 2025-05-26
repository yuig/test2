package kotlin.text;

import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/MatchResult;", "", "t72/j", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface MatchResult {
    IntRange a();

    String getValue();

    j next();
}
