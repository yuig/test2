package com.amazonaws.util.json;

import java.io.EOFException;
import java.io.StringReader;
import java.io.StringWriter;
import um.a;
import um.b;
import um.c;

/* loaded from: classes3.dex */
final class GsonFactory implements AwsJsonFactory {

    /* renamed from: com.amazonaws.util.json.GsonFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29055a;

        static {
            int[] iArr = new int[b.values().length];
            f29055a = iArr;
            try {
                iArr[b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29055a[b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29055a[b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29055a[b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29055a[b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29055a[b.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29055a[b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29055a[b.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29055a[b.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29055a[b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final class GsonReader {

        /* renamed from: a, reason: collision with root package name */
        public final a f29056a;

        public GsonReader(StringReader stringReader) {
            this.f29056a = new a(stringReader);
        }

        public final AwsJsonToken a() {
            AwsJsonToken awsJsonToken = null;
            try {
                b K = this.f29056a.K();
                if (K != null) {
                    switch (AnonymousClass1.f29055a[K.ordinal()]) {
                        case 1:
                            awsJsonToken = AwsJsonToken.BEGIN_ARRAY;
                            break;
                        case 2:
                            awsJsonToken = AwsJsonToken.END_ARRAY;
                            break;
                        case 3:
                            awsJsonToken = AwsJsonToken.BEGIN_OBJECT;
                            break;
                        case 4:
                            awsJsonToken = AwsJsonToken.END_OBJECT;
                            break;
                        case 5:
                            awsJsonToken = AwsJsonToken.FIELD_NAME;
                            break;
                        case 6:
                            awsJsonToken = AwsJsonToken.VALUE_BOOLEAN;
                            break;
                        case 7:
                            awsJsonToken = AwsJsonToken.VALUE_NUMBER;
                            break;
                        case 8:
                            awsJsonToken = AwsJsonToken.VALUE_NULL;
                            break;
                        case 9:
                            awsJsonToken = AwsJsonToken.VALUE_STRING;
                            break;
                        case 10:
                            break;
                        default:
                            awsJsonToken = AwsJsonToken.UNKNOWN;
                            break;
                    }
                }
            } catch (EOFException unused) {
            }
            return awsJsonToken;
        }
    }

    public static final class GsonWriter {

        /* renamed from: a, reason: collision with root package name */
        public final c f29057a;

        public GsonWriter(StringWriter stringWriter) {
            this.f29057a = new c(stringWriter);
        }
    }
}
