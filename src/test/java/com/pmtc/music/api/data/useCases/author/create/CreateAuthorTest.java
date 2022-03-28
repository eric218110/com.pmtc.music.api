package com.pmtc.music.api.data.useCases.author.create;

import com.pmtc.music.api.data.author.create.CreateAuthor;
import com.pmtc.music.api.domain.author.models.AuthorModel;
import com.pmtc.music.api.domain.author.protocols.http.dto.add.AddAuthorDTO;
import com.pmtc.music.api.infra.database.repository.create.AddAuthorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class CreateAuthorTest {

    @Mock
    private AddAuthorRepository addAuthorRepositoryMock;
    private final CreateAuthor sut = new CreateAuthor(this.addAuthorRepositoryMock);

    @Test
    void shouldOnCreateAuthorReturnsAuthorModelWithNameEqualsNameAddAuthorDTO(){
        AuthorModel authorModelResult = this.sut.onCreateAuthor(new AddAuthorDTO("any name"));
        Assertions.assertEquals(authorModelResult.name, "any name");
    }

}
