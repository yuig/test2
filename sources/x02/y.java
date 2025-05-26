package x02;

/* loaded from: classes4.dex */
public final class y extends uq0.h {
    @Override // uq0.h
    public final t1 b(String[] strArr, int i13) {
        if (strArr == null || strArr.length < 1) {
            throw new IllegalStateException("BoardFeedRepository requires a String key of navigation id");
        }
        return (i13 != 8 || strArr.length <= 2) ? new w(i13, strArr[0]) : new w(strArr[0], i13, strArr[1], Boolean.parseBoolean(strArr[2]));
    }

    @Override // uq0.h
    public final t1 c(int i13, String str) {
        return new w(i13, str, 0);
    }
}
