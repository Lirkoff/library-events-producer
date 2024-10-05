package com.learnKafka.domain;

public record Book(
        Integer bookId,
        String bookName,
        String bookAuthor
) {
}
