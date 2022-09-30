package com.got.houses.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/got/houses/services/RetrofitService;", "", "getAllHouses", "Lretrofit2/Response;", "", "Lcom/got/houses/models/House;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBooks", "Lcom/got/houses/models/Book;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacter", "getHouse", "Companion", "app_debug"})
public abstract interface RetrofitService {
    @org.jetbrains.annotations.NotNull()
    public static final com.got.houses.services.RetrofitService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "houses/")
    public abstract java.lang.Object getAllHouses(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.got.houses.models.House>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "houses/{id}")
    public abstract java.lang.Object getHouse(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.got.houses.models.House> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "books/{id}")
    public abstract java.lang.Object getBooks(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.got.houses.models.Book>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "characters/{id}")
    public abstract java.lang.Object getCharacter(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.got.houses.models.House>>> p1);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/got/houses/services/RetrofitService$Companion;", "", "()V", "retrofitService", "Lcom/got/houses/services/RetrofitService;", "getRetrofitService", "()Lcom/got/houses/services/RetrofitService;", "setRetrofitService", "(Lcom/got/houses/services/RetrofitService;)V", "getInstance", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.Nullable()
        private static com.got.houses.services.RetrofitService retrofitService;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.got.houses.services.RetrofitService getRetrofitService() {
            return null;
        }
        
        public final void setRetrofitService(@org.jetbrains.annotations.Nullable()
        com.got.houses.services.RetrofitService p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.got.houses.services.RetrofitService getInstance() {
            return null;
        }
    }
}