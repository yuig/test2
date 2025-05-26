package x02;

/* loaded from: classes4.dex */
public final class c extends uq0.h {
    @Override // uq0.h
    public final t1 b(String[] strArr, int i13) {
        if (strArr == null || strArr.length < 1 || strArr.length > 3) {
            throw new IllegalStateException("AggregatedCommentFeedRepository: Illegal arguments, request requires model id as a parameter with an optional String for the number of results");
        }
        if (strArr.length == 1) {
            return new a(i13, strArr[0], null);
        }
        if (strArr.length == 2) {
            return new a(i13, strArr[0], strArr[1]);
        }
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        a aVar = new a(i13);
        aVar.f131286f = str;
        aVar.f131287g = str2;
        aVar.f131288h = str3;
        return aVar;
    }

    @Override // uq0.h
    public final t1 c(int i13, String str) {
        a aVar = new a(i13, str);
        aVar.f131286f = "";
        aVar.f131287g = null;
        return aVar;
    }
}
