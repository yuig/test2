package com.apollographql.apollo3.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo3/exception/CacheMissException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "wc/j", "apollo-api"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CacheMissException extends ApolloException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CacheMissException(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "Object '"
            if (r4 != 0) goto L10
            java.lang.String r4 = "' not found"
            java.lang.String r3 = a.a.k(r0, r3, r4)
            goto L36
        L10:
            if (r5 == 0) goto L1d
            java.lang.String r5 = "Field '"
            java.lang.String r0 = "' on object '"
            java.lang.String r1 = "' is stale"
            java.lang.String r3 = a.a.m(r5, r4, r0, r3, r1)
            goto L36
        L1d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = "' has no field named '"
            r5.append(r3)
            r5.append(r4)
            r3 = 39
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L36:
            r4 = 2
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.exception.CacheMissException.<init>(java.lang.String, java.lang.String, boolean):void");
    }
}
