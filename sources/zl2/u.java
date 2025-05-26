package zl2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.i1;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f142154a = i1.j(rm2.t.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f142155b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f142156c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f142157d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f142158e;

    /* renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f142159f;

    /* renamed from: g, reason: collision with root package name */
    public static final LinkedHashSet f142160g;

    static {
        List<gn2.c> j13 = f0.j(gn2.c.BOOLEAN, gn2.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (gn2.c cVar : j13) {
            String b13 = cVar.getWrapperFqName().f().b();
            Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
            k0.u(rm2.t.f(b13, cVar.getJavaKeywordName() + "Value()" + cVar.getDesc()), linkedHashSet);
        }
        f142155b = i1.i(i1.i(i1.i(i1.i(i1.i(i1.i(linkedHashSet, rm2.t.g("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), rm2.t.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), rm2.t.f("Double", "isInfinite()Z", "isNaN()Z")), rm2.t.f("Float", "isInfinite()Z", "isNaN()Z")), rm2.t.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), rm2.t.f("CharSequence", "isEmpty()Z"));
        f142156c = rm2.t.g("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f142157d = i1.i(i1.i(i1.i(i1.i(i1.i(i1.i(rm2.t.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), rm2.t.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), rm2.t.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), rm2.t.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), rm2.t.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), rm2.t.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), rm2.t.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f142158e = i1.i(i1.i(rm2.t.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), rm2.t.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), rm2.t.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        gn2.c cVar2 = gn2.c.BOOLEAN;
        gn2.c cVar3 = gn2.c.BYTE;
        List j14 = f0.j(cVar2, cVar3, gn2.c.DOUBLE, gn2.c.FLOAT, cVar3, gn2.c.INT, gn2.c.LONG, gn2.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = j14.iterator();
        while (it.hasNext()) {
            String b14 = ((gn2.c) it.next()).getWrapperFqName().f().b();
            Intrinsics.checkNotNullExpressionValue(b14, "asString(...)");
            String[] a13 = rm2.t.a("Ljava/lang/String;");
            k0.u(rm2.t.f(b14, (String[]) Arrays.copyOf(a13, a13.length)), linkedHashSet2);
        }
        String[] a14 = rm2.t.a("D");
        LinkedHashSet i13 = i1.i(linkedHashSet2, rm2.t.f("Float", (String[]) Arrays.copyOf(a14, a14.length)));
        String[] a15 = rm2.t.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f142159f = i1.i(i13, rm2.t.f("String", (String[]) Arrays.copyOf(a15, a15.length)));
        String[] a16 = rm2.t.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f142160g = rm2.t.f("Throwable", (String[]) Arrays.copyOf(a16, a16.length));
    }

    public static boolean a(ym2.e arrayFqName) {
        Intrinsics.checkNotNullParameter(arrayFqName, "fqName");
        if (!Intrinsics.d(arrayFqName, xl2.q.f135301g)) {
            Intrinsics.checkNotNullParameter(arrayFqName, "arrayFqName");
            if (xl2.q.f135297c0.get(arrayFqName) == null) {
                return false;
            }
        }
        return true;
    }
}
