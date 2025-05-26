package com.pinterest.feature.search;

import h61.n;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f47622a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f47623b;

    static {
        int[] iArr = new int[br.c.values().length];
        try {
            iArr[br.c.RECENT_HISTORY_PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[br.c.RECENT_HISTORY_MY_PIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[br.c.TRENDING_QUERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[br.c.RECOMMENDED_QUERY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[br.c.PIN_LOCAL_CACHE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[br.c.ENRICHED_AUTOCOMPLETE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[br.c.PERSONAL_QUERY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[br.c.SEARCH_FILTER_QUERY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[br.c.PIN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[br.c.PINNER.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f47622a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.EXPLORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[n.SHOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[n.PROFILES.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        f47623b = iArr2;
    }
}
